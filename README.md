# letscode_rebels
Hello! Hello!!

## How to use it?

### To add a Rebel:

#### POST - v1/rebels/add
Below you'll find a model to make the POST

{
  “nome”: “Teste”,
	“idade”: ”integer”,
	“genero”: "M",
 	“localização”: {
    “latitude”:888888,
    “longitude”:999999,
    “nomeGalaxia”:”Um nome de Galaxia”
}
	“inventario”:{
    "arma":3,
    "municao":5

}

### To update the Rebels localization goes for this PATCH
#### PATCH - v1/rebels/localization/{id}

{
  "localizacao":{
    “latitude”:5555555,
    “longitude”:444444,
    “nomeGalaxia”:”Uma nova Galaxia”
    }
}

### If you'll want to check all the Rebels in the database, goes for a GET
#### GET - v1/rebels

If you have any doubt ask for more infos with us!

