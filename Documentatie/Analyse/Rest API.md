REST is in principe een methode van software architectuur.

REST heeft zes richtlijnen waaraan strict gehouden word:
1. Client-Server
   - Door het scheiden van de front-end, back-end en servers kan het veel makkelijker zijn om op verschillende devices hetzelfde te laten runnen met een ander uiterlijk die geoptimaliseert is voor dat device. Dit verbreed de schaalbaarheid van je product.
2. Uniform-Interface
   - Het systeem architectuur wordt vereenvoudigd en de zichtbaarheid van interacties verbeterd, door algemeenheid toe te passen op de component interface. Om een dergelijke uniforme interface te bereiken.
3. Stateless
   - Ieder request van client naar server moet alle benodigde informatie bevatten en kan dus geen gebruik maken van opgeslagen context. Hierdoor word nooit gevoelige informatie opgeslagen op de server.
4. Cacheable
   - Dit is de optie om data die de gebruiker gebruikt cacheable te maken, hierdoor kan een gebruiker eerder ingevulde data meteen weer gebruiken zonder moeite.
5. Layered system
   - Een gelaagd systeem staat de API toe om opgebouwd te worden in hierarchische lagen, door te zorgen dat ieder component niet voorbij de directe laag waar het in opereert kan 'kijken'.
6. Code on Demand
   - REST staat clients toe om code te downloaden en uitvoeren in de vorm van applets of scripts. Dit vereenvoudigt clients door het aantal features dat geïmplementeerd moet worden terug te brengen.

Bij het REST API komt ook het volgende kijken:

| Methode | Betekenis |
| --- | --- |
| GET | Verzoekt om een 'resource' van een server, waarbij een resource een speciale variabele is (de resource representation) die een referentie tot een externe resource bevat. De data kan vervolgens worden aangepast en teruggestuurt met een PUT-request. |
| POST | Een client voegt een nieuwe resource toe, bijvoorbeeld de bestelling van een product. |
| PUT | Update een resource met nieuwe data, bestaande data wordt verwijderd. Dit gebruik je bijvoorbeeld als je met een GET request de specificaties van een VPS opvraagt, de description aanpast en het gehele array terug plaatst. |
| DELETE | Gebruik je voor het verwijderen van resources. |

Zodra een verzoek word gestuurd krijg je ook een HTTP code response bij een goede response krijg je een 2xx code en bij een error 4xx of 5xx

---

Sources:
Canvas,
https://www.transip.nl/knowledgebase/artikel/2997-wat-is-een-rest-api/
