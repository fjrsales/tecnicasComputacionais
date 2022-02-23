# imports
import xmltodict
import json
import os

# file information
input_xml = "./nfe/nota2.xml"
output_json = "./nfe/nota2.json"

# file reading
with open(input_xml) as f:
    text = f.read()

# xml parsing
dictionary = xmltodict.parse(text)

# json dumping
json_object = json.dumps(dictionary)

# file writing
with open(output_json,"w") as f:
    f.write(json_object)

# printing keys (k) and values (v)
for k,v in dictionary.items():
    print(k,v)
