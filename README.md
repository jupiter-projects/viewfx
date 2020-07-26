# ViewFX
JavaFX utility to load FXML.

## Clone

```bash
$ git clone https://github.com/jupiter-projects/viewfx
$ cd viewfx
$ ./mvnw install
```

## Add dependency to your project

```xml
<dependency>
    <groupId>com.julianjupiter.viewfx</groupId>
    <artifactId>viewfx</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

## Usage

```java
var view = ViewFX.of(HelloController.class, AnchorPane.class);
var anchorPane = view.component();
var scene = new Scene(anchorPane);
stage.setScene(scene);
var helloHontroller = view.controller();
helloController.setPrimaryStage(stage);
helloController.setX(x);
```

With `ResourceBundle`:

```java
var locale = new Locale("en");
var resourceBundle = ResourceBundle.getBundle("i18n/messages", locale);
var view = ViewFX.of(HelloController.class, AnchorPane.class, resourceBundle);
```

## License

```
Copyright 2020 Julian Jupiter

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```