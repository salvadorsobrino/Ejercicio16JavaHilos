El calculo de numeros primos es una tarea complicada y costosa de hacer porque puede
llevar mucho tiempo de procesamiento;

Queremos hacer un programa que pida 3 numeros por pantalla y nos diga si son primos o no.

Pero dado que el calculo del numero primo puede ser muy costoso, queremos abrir un hilo de
ejecución por cada numero introducido. Cada hilo recibira el numero que ha introducido el 
usuario por pantalla, y mostrará si es primo o no.

Importante:

Un objeto implementa una Region Critica estricta si: todas sus variables son private y todos sus métodos son synchronized