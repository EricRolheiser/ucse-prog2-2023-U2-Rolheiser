# Run complete. Total time: 00:02:39

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                           (size)  Mode  Cnt    Score    Error  Units
StreamBenchmark.filterParallel    10000000  avgt    5  262,990 ▒ 67,883  ms/op
StreamBenchmark.filterSequential  10000000  avgt    5  131,432 ▒  8,569  ms/op


Concluciones

filterParallel: El método filterParallel utiliza parallelStream para realizar el filtrado de los números pares en la lista. 
El tiempo promedio que toma esta operación es de 262.990 ms/op (milisegundos por operación). 
Esto indica que el procesamiento en paralelo toma más tiempo en comparación con el procesamiento secuencial en este caso específico.

filterSequential: El método filterSequential utiliza stream para realizar el filtrado secuencial de los números pares 
en la misma lista. El tiempo promedio que toma esta operación es de 131.432 ms/op. 
En este caso, el procesamiento secuencial es más rápido que el procesamiento en paralelo.

En base a estos resultados, podemos concluir que en este escenario particular, 
el uso de parallelStream para filtrar los números pares no proporciona un beneficio en términos de rendimiento 
en comparación con el uso de stream. De hecho, el procesamiento en paralelo parece ser más lento en este caso.

Es importante tener en cuenta que los resultados pueden variar según diversos factores, 
como la configuración del hardware, el tamaño de los datos, la carga del sistema, entre otros. 
Dado que el rendimiento de las operaciones de flujo depende de varios factores, los resultados obtenidos 
en esta prueba pueden no ser aplicables a todos los escenarios. Es recomendable realizar pruebas exhaustivas 
en diferentes configuraciones y tamaños de datos para obtener conclusiones más sólidas sobre qué enfoque es más adecuado 
en un caso particular.