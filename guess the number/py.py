import requests as r
import pandas as pd

if __name__ == '__main__':
    # Get drink menu json
    page = r.get("https://www.starbucks.com/bff/ordering/menu")
    drinks = next((x for x in page.json()['menus'] if x['name'] == 'Drinks'), None)

    result = []

    unwanted = ['Clover® Brewed Coffees', 'Coffee Travelers', 'Iced Clover® Brewed Coffees', 'Bottled Teas', 
        'Milk', 'Sparkling Water', 'Water'] # mostly packaged drinks

    for drink_type in drinks['children']: # i.e. Hot Coffees
        category = drink_type['name']
        print('---', category, '---')

        for drink_family in drink_type['children']: 
            if (drink_family['name'] not in unwanted):
                print(drink_family['name']) # i.e. Americanos
                for product in drink_family['products']:
                    # Get product's nutrition page
                    url = product['uri'].split("/")
                    prod_page = r.get("https://www.starbucks.com/bff/ordering/" + url[2] + '/' + url[3])
                    drink = prod_page.json()['products'][0]

                    drink_name = drink['name'] 

                    for drink_size in drink['sizes']:
                        size = drink_size['name']
                        nutrition = drink_size['nutrition']
                        if nutrition is not None:
                            calories = nutrition.get('calories', {}).get('displayValue', 'NA')
                            additionalFacts = nutrition.get('additionalFacts', [])
                            fat = next((item['value'] for item in additionalFacts if item['name'] == 'Total Fat'), 'NA')
                            cholesterol = next((item['value'] for item in additionalFacts if item['name'] == 'Cholesterol'), 'NA')
                            sodium = next((item['value'] for item in additionalFacts if item['name'] == 'Sodium'), 'NA')
                            carb = next((item['value'] for item in additionalFacts if item['name'] == 'Total Carbohydrates'), 'NA')
                            sugar = next((item.get('sugars', {}).get('value', 'NA') for item in additionalFacts if item['name'] == 'Total Carbohydrates'), 'NA')
                            protein = next((item['value'] for item in additionalFacts if item['name'] == 'Protein'), 'NA')
                            caffeine = next((item['value'] for item in additionalFacts if item['name'] == 'Caffeine'), 'NA')
                        else:
                            calories = fat = cholesterol = sodium = carb = sugar = protein = caffeine = 'NA'
                        # Append drink nutrition facts for the current size
                        result.append([drink_name, category, size, calories, fat, cholesterol, sodium, carb, sugar, protein, caffeine])
                    
        
    # Write data to csv
    columnNames = ['drink_name', 'type', 'size', 'calories', 'fat', 'cholesterol', 'sodium', 'carb', 'sugar', 'protein', 'caffeine']
    df = pd.DataFrame(result, columns=columnNames)

    df.to_csv(path_or_buf='sbux_nutrition.csv', index=False)
    print("----- Finished! -----")
