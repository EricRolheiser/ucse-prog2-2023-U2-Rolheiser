PS C:\Users\Usuario\Desktop\ucse-prog2-2023-U2-Rolheiser\Ejemplo> ./gradlew runJmh   

> Task :runJmh
# JMH version: 1.33
# VM version: JDK 17.0.6, Java HotSpot(TM) 64-Bit Server VM, 17.0.6+9-LTS-190
# VM invoker: C:\Program Files\Java\jdk-17\bin\java.exe
# VM options: -Dfile.encoding=windows-1252 -Duser.country=ES -Duser.language=es -Duser.variant
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.StreamBenchmark.filterParallel
# Parameters: (size = 10000000)

# Run progress: 0,00% complete, ETA 00:02:30
# Fork: 1 of 1
# Warmup Iteration   1: 1125,859 ms/op
# Warmup Iteration   2: 794,942 ms/op
# Warmup Iteration   3: 1125,890 ms/op
# Warmup Iteration   4: 483,652 ms/op
# Warmup Iteration   5: 248,806 ms/op
Iteration   1: 274,206 ms/opG [54s]
Iteration   2: 287,056 ms/opG [59s]  
Iteration   3: 244,490 ms/opG [1m 5s]
Iteration   4: 259,846 ms/opG [1m 10s]
Iteration   5: 249,351 ms/opG [1m 15s]


Result "org.example.StreamBenchmark.filterParallel":
  262,990 ▒(99.9%) 67,883 ms/op [Average]
  (min, avg, max) = (244,490, 262,990, 287,056), stdev = 17,629
  CI (99.9%): [195,107, 330,873] (assumes normal distribution)


# JMH version: 1.33
# VM version: JDK 17.0.6, Java HotSpot(TM) 64-Bit Server VM, 17.0.6+9-LTS-190
# VM invoker: C:\Program Files\Java\jdk-17\bin\java.exe
# VM options: -Dfile.encoding=windows-1252 -Duser.country=ES -Duser.language=es -Duser.variant
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.StreamBenchmark.filterSequential
# Parameters: (size = 10000000)

# Run progress: 50,00% complete, ETA 00:01:21
# Fork: 1 of 1
# Warmup Iteration   1: 149,671 ms/op]
# Warmup Iteration   2: 130,601 ms/op]
# Warmup Iteration   3: 125,602 ms/op]
# Warmup Iteration   4: 138,978 ms/op]
# Warmup Iteration   5: 135,078 ms/op
Iteration   1: 129,924 ms/opG [2m 13s]
Iteration   2: 128,722 ms/opG [2m 18s]
Iteration   3: 133,450 ms/opG [2m 23s]
Iteration   4: 133,891 ms/opG [2m 29s]
Iteration   5: 131,175 ms/opG [2m 34s]


Result "org.example.StreamBenchmark.filterSequential":
  131,432 ▒(99.9%) 8,569 ms/op [Average]
  (min, avg, max) = (128,722, 131,432, 133,891), stdev = 2,225
  CI (99.9%): [122,864, 140,001] (assumes normal distribution)


# Run complete. Total time: 00:02:39

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                           (size)  Mode  Cnt    Score    Error  Units
StreamBenchmark.filterParallel    10000000  avgt    5  262,990 ▒ 67,883  ms/op
StreamBenchmark.filterSequential  10000000  avgt    5  131,432 ▒  8,569  ms/op

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.5.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 2m 41s
2 actionable tasks: 1 executed, 1 up-to-date
PS C:\Users\Usuario\Desktop\ucse-prog2-2023-U2-Rolheiser\Ejemplo> 

