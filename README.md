El calculo de numeros primos es una tarea complicada y costosa de hacer porque puede
llevar mucho tiempo de procesamiento;

Queremos hacer un programa que pida 3 numeros por pantalla y nos diga si son primos o no.

Pero dado que el calculo del numero primo puede ser muy costoso, queremos abrir un hilo de
ejecución por cada numero introducido. Cada hilo recibira el numero que ha introducido el 
usuario por pantalla, y mostrará si es primo o no.

Importante:

Un objeto implementa una Region Critica estricta si: todas sus variables son private y todos sus métodos son synchronized

NOTA:
 
En este caso estan accediendo a objetos distintos por lo tanto no estan accediendo a ningún recurso compartido no hay ese problema. Pero en caso de que se diera
tenemos la clausula synchronized en el método. También se podrían implementar otros mecanismos como semaforos, locks o monitores para  asegurar el acceso al recurso de forma segura.

Utilizando la interfaz Lock. Un Tipo Abstracto de Dato Semaphore ( binario o con n permisos ) o monitores (synchronized)
