# lambda-thumbnail

### Build
- Run: `mvn clean compile package`

### AWS Lambda Handler
com.github.clagomess.lambdaThumbnail.MainHandler::run

### IO
#### Request:
```json
{
  "crop": true,
  "width": 100,
  "height": 100,
  "desHashPai": "123",
  "desArquivo": "iVBORw0KGgoAAAANSUhEUg [...]"
}

```

#### Response:
```json
{
  "desHash": "8bba9dcc316506e57caf4943c62ded76",
  "nomArquivo": "thumb_true_100_100",
  "desArquivo": "/9j/4AAQSkZJRgABA [...]"
}
```

