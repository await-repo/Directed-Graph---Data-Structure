## **Grafo dirigido**

El proyecto contiene las siguientes clases:

* **`Graph`** donde se establece la lógica de los métodos para manipular un grafo dirigido.
* **`Node`** contiene la informacion de un nodo.
* **`Edge`** contiene la informacion de una arista, en un grafo dirigido las aristas sí tienen una dirección, van del nodo origen al nodo destino.
* **`test`** prueba un ejemplo para observar el funcionamiento del grafo.

### **Tipo de Grafo**

A continuación describimos las caracteristicas de un grafo dirigido.

**Grafo dirigido**, este tipo de grafo tiene aristas con una dirección especifica van desde un nodo de origen hasta un nodo de destino, esto es importante ya que determina cómo pueden recorrer un grafo en base a la dirección de las aristas.

![Graph](https://user-images.githubusercontent.com/115047831/214960948-60325311-025a-4285-a1aa-f0fa40dba5c1.PNG)

### **Tipo de Arista**

**Arista dirigida** las aristas dirigidas contiene una dirección de origen a destino, esto determina estrictamente una dirección.

![EdgeDirected](https://user-images.githubusercontent.com/115047831/214962025-84cc4968-fdaf-4909-9698-22ea0cbe6072.png)

## Agregar Vertice (Nodo)

Tenemos el siguiente Grafo Dirigido, el nuevo nodo que se agregó fue el Nodo X (Café). Este nodo ya está incluido dentro del grafo, solo que aún no esta conectado a ningún nodo.

![GraphExample2](https://user-images.githubusercontent.com/115047831/214966495-c6086fe8-a3a5-414f-9421-9d47259c331f.PNG)


## Agregar Arista

Tenemos el siguiente Grafo Dirigido, si queremos conectar el Nodo X (Café) debemos agregar una nueva arista, en los grafos dirigidos las aristas tienen dirección así que podemos crear una nueva arista con origen en el Nodo B (Verde) al Nodo X (Café) y crear otra Arista con origen en el Nodo X (Café) al Nodo E (Morado). El grafo con las nuevas aristas creadeas quedaría como se muestra en la imagen de abajo.

![GraphExample3](https://user-images.githubusercontent.com/115047831/214968023-007a1c8e-fe04-4e7a-9a88-6d3923248cd8.PNG)

## Eliminar Vertice (Nodo)

**Cuando se elimina un Nodo del grafo también se eliminan todas las aristas que lo conectaban.**

Ya que debemos de eliminar tanto el nodo como sus aristas debemos de buscarlos dentro de sus colecciones de nodos y aristas, en el caso de las aristas se deben de eliminar todas en donde aparezca el nodo a eliminar ya sea como nodo de origen o nodo de destino.

Las instrucciones para realizar la eliminación de un Vertice (Nodo) es la siguiente.
```java
void deleteVertex (Node node) {
    nodes.removeIf(aux -> aux == node);
    edges.removeIf(edge -> edge.start == node || edge.end == node);
}
```

Si eliminamos el Nodo C (Rojo) el grafo quedaría de la siguiente forma.

![GraphExample4](https://user-images.githubusercontent.com/115047831/214969882-63082e40-a1df-4463-bc87-d31186099815.PNG)


## Diagrama de clases con UML

> **Nota:** El siguiente diagrama de clases representa la lógica de programación utilizada para construir un **Grafo Dirigido**. La clase **test** no se incluye en el diagrama UML porque solo contiene el método main y únicamente es utilizada para demostrar el funcionamiento de los métodos del Grafo dirigido.

![UML Graph](https://user-images.githubusercontent.com/115047831/214956238-0c0e9637-dce2-413f-90d6-dd3fbcbf552d.png)

