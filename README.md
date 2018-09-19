# workshop-java

Esta aplicação contém um endpoint "/image" que recebe como parâmento uma URL de uma imagem. Mas que atualmente não retorna nada.

```
curl --header "Content-Type: application/json" \
--request POST \
--data '{"imageUrl":"/any_image_url.png"}' \
http://localhost:8080/workshop/image
```
Complete o projeto atendendo os requisitos a seguir:

* O sistema deve retornar uma descrição contendo a quantidade de faces encontradas na imagem. (Estruture o retorno como desejar)
* Para mapear a imagem, você deverá se conectar a [Google API Vision](https://cloud.google.com/vision/docs/reference/rest/v1/images/annotate). (a URL já se encontra no arquivo de configuração application.yaml)

Exemplo de como chamar a API Vision:

```
curl --header "Content-Type: application/json" \
--request POST \
--data '{
  "requests": [ \
    { \
      "image": { \
        "source": { \ 
        	"imageUri": "/any_image_url.png" \
        } \
      }, \
      "features": [ \
        { \
          "type": "FACE_DETECTION" \
        } \
      ] \
    } \
  ] \
}' \
https://vision.googleapis.com/v1/images:annotate?key=<you_api_key>
```

Divirtam-se!! :-)
