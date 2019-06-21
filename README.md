# hiking.connor.fun
this is overkill

To run on spark local mode:

```
>sbt package
>spark-submit --class "HikingApp" --master local[4] target/scala-2.11/hiking-spark_2.11-0.1.jar
```

To run remotely:

```$xslt
>sbt package
>scp target/scala-2.11/hiking-spark_2.11-0.1.jar <ip>
```

OR if you're on GCP upload it using the SSH online tool thing

SSH into machine

```$xslt
spark-submit --class "HikingApp" \
 --master spark://<ip>:7077 \
 --deploy-mode cluster \
 target/scala-2.11/hiking-spark_2.11-0.1.jar
```
(I haven't actually tested this yet but it's fine)
