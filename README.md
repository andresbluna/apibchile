# API REST PARA BANCO CHILE

Este proyecto es una prueba de Conocimiento para Banco Chile, se debe realizar un sistema fullstack para conectar un frontend en angular y una api rest que a su vez consumen data desde http://miindicador.cl

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas tanto del back como del front(https://github.com/andresbluna/frontbancochile) de esta app web fullstack._

### Pre-requisitos 📋

_Que cosas necesitas para instalar la API REST en Local_

```
Tener instalado Maven en tu carpeta local
Tener espacio en tu disco duro de al menos 50 mb
Tener algún ide de desarrollo como Intellij Idea, Netbeans o Eclipse

```
_Que cosas necesitas para instalar el front Angular en Local_

```
Tener instalado Angular 17.x.x
Tener espacio en tu disco duro de al menos 50 mb
Tener algún ide de desarrollo como Vscode, Webstorm.
Tener Node.js 18.x.x compatible con Angular 17.x

```

### Instalación 🔧

_Vamos a lo que nos convoca! Ahora toca realizar la configuración e instalación de nuestra API REST_

_Primero_

```
Instalamos y configuramos Maven en Local (link de ejemplo):                                         		 						https://www.youtube.com/watch?v=rl5-yyrmp-0
```

_Luego_

```
Descargamos la API REST desde GITHUB (Link de Repositorio):                                       https://github.com/andresbluna/apiUsersBCI.git
```
_y por último_

```
Levantamos nuestra API desde el IDE de preferencia, IntelliJ Idea, Netbeans ó Eclipse.
```

## Ejecutando las pruebas ⚙️

_Para realizar las pruebas podemos ocupar un IDE de consulta de APIS como Postman, Bruno, Insomnia, cualquiera que sea de tu gusto. Una vez arranquemos la API en nuestro IDE, creamos nuestra solicitud GET con el siguiente endpoint: http://localhost:8080/indicators y para obtener solo la data de indicadores de uf ingresas http://localhost:8080/uf,
o si es de tu gusto mas rápido, puedes acceder a través de Swagger: http://localhost:8080/swagger-ui/index.html.



### Response🔩

****200 CREATED Si recibes la data correctamente de los indicadores económicos**


```json
{
  "version": "1.7.0",
  "autor": "mindicador.cl",
  "fecha": "2024-05-20T05:00:00.000+00:00",
  "uf": {
    "codigo": "uf",
    "nombre": "Unidad de fomento (UF)",
    "unidad_medida": "Pesos",
    "fecha": "2024-05-20T04:00:00.000+00:00",
    "valor": 37372.71
  },
  "ivp": {
    "codigo": "ivp",
    "nombre": "Indice de valor promedio (IVP)",
    "unidad_medida": "Pesos",
    "fecha": "2024-05-20T04:00:00.000+00:00",
    "valor": 38699.96
  },
  "dolar": {
    "codigo": "dolar",
    "nombre": "Dólar observado",
    "unidad_medida": "Pesos",
    "fecha": "2024-05-20T04:00:00.000+00:00",
    "valor": 897.11
  },
  "dolar_intercambio": {
    "codigo": "dolar_intercambio",
    "nombre": "Dólar acuerdo",
    "unidad_medida": "Pesos",
    "fecha": "2014-11-13T03:00:00.000+00:00",
    "valor": 758.87
  },
  "euro": {
    "codigo": "euro",
    "nombre": "Euro",
    "unidad_medida": "Pesos",
    "fecha": "2024-05-20T04:00:00.000+00:00",
    "valor": 975.54
  },
  "ipc": {
    "codigo": "ipc",
    "nombre": "Indice de Precios al Consumidor (IPC)",
    "unidad_medida": "Porcentaje",
    "fecha": "2024-04-01T03:00:00.000+00:00",
    "valor": 0.5
  },
  "utm": {
    "codigo": "utm",
    "nombre": "Unidad Tributaria Mensual (UTM)",
    "unidad_medida": "Pesos",
    "fecha": "2024-05-01T04:00:00.000+00:00",
    "valor": 65443.0
  },
  "imacec": {
    "codigo": "imacec",
    "nombre": "Imacec",
    "unidad_medida": "Porcentaje",
    "fecha": "2024-03-01T03:00:00.000+00:00",
    "valor": 0.8
  },
  "tpm": {
    "codigo": "tpm",
    "nombre": "Tasa Política Monetaria (TPM)",
    "unidad_medida": "Porcentaje",
    "fecha": "2024-05-20T04:00:00.000+00:00",
    "valor": 6.5
  },
  "libra_cobre": {
    "codigo": "libra_cobre",
    "nombre": "Libra de Cobre",
    "unidad_medida": "Dólar",
    "fecha": "2024-05-20T04:00:00.000+00:00",
    "valor": 4.69
  },
  "tasa_desempleo": {
    "codigo": "tasa_desempleo",
    "nombre": "Tasa de desempleo",
    "unidad_medida": "Porcentaje",
    "fecha": "2024-03-01T03:00:00.000+00:00",
    "valor": 8.68
  },
  "bitcoin": {
    "codigo": "bitcoin",
    "nombre": "Bitcoin",
    "unidad_medida": "Dólar",
    "fecha": "2024-05-15T04:00:00.000+00:00",
    "valor": 66239.13
  }
}
```




## Autor ✒️


* **Andrés Luna** - *Java Developer && STUFF * - [andresbluna](https://github.com/andresbluna)

## Licencia 📄

Este proyecto está bajo la Licencia **The Unlicense**

## THANKS FOR ALL!! 🎁

* Gracias enormes y totales, por permitirme participar de este desafío 📢




---
⌨️ con ❤️ por [andresbluna](https://github.com/andresbluna) 😊
