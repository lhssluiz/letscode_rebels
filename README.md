# letscode_rebels
Hello! Hello!!

## How to use it?

### To add a Rebel:

#### POST - v1/rebels/add
Below you'll find a model to make the POST

{
  “nome”: “Rodrigo”,
	“idade”: ”20”,
	“genero”: "M",
 	“localização”: {
    “latitude”:888888,
    “longitude”:999999,
    “nomeGalaxia”:”Orion”
}
	“inventario”:{
    "arma":3,
    "municao":5,
    "agua": 1,

}
![add](https://user-images.githubusercontent.com/68027909/158874056-7fa106ed-5cbb-4cb2-bb09-0cf2fa173724.jpg)

### To update the Rebels localization goes for this PATCH
#### PATCH - v1/rebels/localizacao/{id}

{
    “latitude”:5555555,
    “longitude”:444444,
    “nomeGalaxia”:”Uma nova Galaxia”
    }
}
![localizacao](https://user-images.githubusercontent.com/68027909/158874857-b741cad4-11a9-4196-a9af-04d1534647d6.jpg)

### If you'll want to check all the Rebels in the database, goes for a GET
#### GET - v1/rebels


![](../../Pictures/rebels.jpg)


### If you'll want to change a Rebels to traitor
#### PATCH - v1/rebels/report-traitor/id

![](../../Pictures/traitor.jpg)

### If you'll want to know a percent of Rebels
#### GET - v1/rebels/reports/rebels-percent

![](../../Pictures/percent_rebels.jpg)

### If you'll want to know a percent of Traitors
#### GET - v1/rebels/reports/traitors-percent

![](../../Pictures/percent_traitors.jpg)

If you have any doubt ask for more infos with us!
