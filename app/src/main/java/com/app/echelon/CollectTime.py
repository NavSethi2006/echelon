import livepopulartimes.crawler
import json

api_key = 'AIzaSyDvdNclx4f2In7boriLO8y4bPHYE5Y1x58'


def hospitalloc():
    ihatemylife = livepopulartimes.get_places_by_search("hospitals near me")
    with open("data_file.json", "w") as write_file:
        json.dump(ihatemylife, write_file)
    
    bruh = ihatemylife[1]['place_id']

    fuckthisshit = livepopulartimes.get_populartimes_by_place_id(api_key, bruh)

    return fuckthisshit

    




hospitalloc()