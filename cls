[33mcommit e27dde7047b1180d13d0b16914817731bf9fdca0[m[33m ([m[1;36mHEAD -> [m[1;32mmain[m[33m)[m
Author: Mohsin <m.mohsin0395@gmail.com>
Date:   Sat Oct 9 15:22:37 2021 +0530

    mohsin

[1mdiff --git a/raj-trainingEjb/build/gfv3ee6.dpf b/raj-trainingEjb/build/gfv3ee6.dpf[m
[1mnew file mode 100644[m
[1mindex 0000000..e69de29[m
[1mdiff --git a/raj-trainingEjb/build/raj-trainingEjb-ejb.jar b/raj-trainingEjb/build/raj-trainingEjb-ejb.jar[m
[1mindex 4b2a589..e8286af 100644[m
Binary files a/raj-trainingEjb/build/raj-trainingEjb-ejb.jar and b/raj-trainingEjb/build/raj-trainingEjb-ejb.jar differ
[1mdiff --git a/raj-trainingEjb/build/raj-trainingEjb-war.war b/raj-trainingEjb/build/raj-trainingEjb-war.war[m
[1mindex 51437d9..ff86af0 100644[m
Binary files a/raj-trainingEjb/build/raj-trainingEjb-war.war and b/raj-trainingEjb/build/raj-trainingEjb-war.war differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/META-INF/MANIFEST.MF b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/META-INF/MANIFEST.MF[m
[1mnew file mode 100644[m
[1mindex 0000000..59499bc[m
[1m--- /dev/null[m
[1m+++ b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/META-INF/MANIFEST.MF[m
[36m@@ -0,0 +1,2 @@[m
[32m+[m[32mManifest-Version: 1.0[m
[32m+[m
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/.netbeans_automatic_build b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/.netbeans_automatic_build[m
[1mnew file mode 100644[m
[1mindex 0000000..e69de29[m
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/.netbeans_update_resources b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/.netbeans_update_resources[m
[1mnew file mode 100644[m
[1mindex 0000000..e69de29[m
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/MANIFEST.MF b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/MANIFEST.MF[m
[1mnew file mode 100644[m
[1mindex 0000000..83eeea7[m
[1m--- /dev/null[m
[1m+++ b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/MANIFEST.MF[m
[36m@@ -0,0 +1,4 @@[m
[32m+[m[32mManifest-Version: 1.0[m
[32m+[m[32mAnt-Version: Apache Ant 1.9.7[m
[32m+[m[32mCreated-By: 1.8.0_211-b12 (Oracle Corporation)[m
[32m+[m
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/META-INF/glassfish-resources.xml b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/META-INF/glassfish-resources.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..9ed3315[m
[1m--- /dev/null[m
[1m+++ b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/META-INF/glassfish-resources.xml[m
[36m@@ -0,0 +1,14 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<!DOCTYPE resources PUBLIC "-//GlassFish.org//DTD GlassFish Application Server 3.1 Resource Definitions//EN" "http://glassfish.org/dtds/glassfish-resources_1_5.dtd">[m
[32m+[m[32m<resources>[m
[32m+[m[32m    <jdbc-connection-pool allow-non-component-callers="false" associate-with-thread="false" connection-creation-retry-attempts="0" connection-creation-retry-interval-in-seconds="10" connection-leak-reclaim="false" connection-leak-timeout-in-seconds="0" connection-validation-method="auto-commit" datasource-classname="com.mysql.jdbc.jdbc2.optional.MysqlDataSource" fail-all-connections="false" idle-timeout-in-seconds="300" is-connection-validation-required="false" is-isolation-level-guaranteed="true" lazy-connection-association="false" lazy-connection-enlistment="false" match-connections="false" max-connection-usage-count="0" max-pool-size="32" max-wait-time-in-millis="60000" name="mysql_training_rootPool" non-transactional-connections="false" pool-resize-quantity="2" res-type="javax.sql.DataSource" statement-timeout-in-seconds="-1" steady-pool-size="8" validate-atmost-once-period-in-seconds="0" wrap-jdbc-objects="false">[m
[32m+[m[32m        <property name="serverName" value="localhost"/>[m
[32m+[m[32m        <property name="portNumber" value="12753"/>[m
[32m+[m[32m        <property name="databaseName" value="training"/>[m
[32m+[m[32m        <property name="User" value="training"/>[m
[32m+[m[32m        <property name="Password" value="training@123"/>[m
[32m+[m[32m        <property name="URL" value="jdbc:mysql://localhost:12753/training?zeroDateTimeBehavior=convertToNull"/>[m
[32m+[m[32m        <property name="driverClass" value="com.mysql.jdbc.Driver"/>[m
[32m+[m[32m    </jdbc-connection-pool>[m
[32m+[m[32m    <jdbc-resource enabled="true" jndi-name="traing_test" object-type="user" pool-name="mysql_training_rootPool"/>[m
[32m+[m[32m</resources>[m
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/persistence.xml b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/persistence.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..d7a2ce7[m
[1m--- /dev/null[m
[1m+++ b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/META-INF/persistence.xml[m
[36m@@ -0,0 +1,8 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">[m
[32m+[m[32m  <persistence-unit name="raj-trainingEjb-ejbPU" transaction-type="JTA">[m
[32m+[m[32m    <jta-data-source>traing_test</jta-data-source>[m
[32m+[m[32m    <exclude-unlisted-classes>false</exclude-unlisted-classes>[m
[32m+[m[32m    <properties/>[m
[32m+[m[32m  </persistence-unit>[m
[32m+[m[32m</persistence>[m
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/bl/BankRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/bl/BankRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..07195ed[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/bl/BankRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/bl/BankRemoteRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/bl/BankRemoteRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..00422ae[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/bl/BankRemoteRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/da/BankLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/da/BankLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..022f8fa[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/da/BankLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/da/BankLocalLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/da/BankLocalLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..3211c1b[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/bank/da/BankLocalLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/Marks.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/Marks.class[m
[1mnew file mode 100644[m
[1mindex 0000000..0a66aef[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/Marks.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/StudentDetails.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/StudentDetails.class[m
[1mnew file mode 100644[m
[1mindex 0000000..7b08b40[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/StudentDetails.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/Students.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/Students.class[m
[1mnew file mode 100644[m
[1mindex 0000000..1427881[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/entity/Students.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/bl/TestMohsinRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/bl/TestMohsinRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..3a1292d[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/bl/TestMohsinRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/bl/TestMohsinRemoteRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/bl/TestMohsinRemoteRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..ba339b3[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/bl/TestMohsinRemoteRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/da/TestMohsinLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/da/TestMohsinLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..1ced87d[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/da/TestMohsinLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/da/TestMohsinLocalLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/da/TestMohsinLocalLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..d26550c[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/mohsin/ejb/da/TestMohsinLocalLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..93c9334[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..6b92df7[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteStatefulBean.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteStatefulBean.class[m
[1mnew file mode 100644[m
[1mindex 0000000..ae61b43[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteStatefulBean.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteStatefulBeanRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteStatefulBeanRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..09e3075[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/bl/TestRemoteStatefulBeanRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..b84a6df[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..ad9d476[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalStatefulBean.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalStatefulBean.class[m
[1mnew file mode 100644[m
[1mindex 0000000..eaf4f45[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalStatefulBean.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalStatefulBeanLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalStatefulBeanLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..7b7bce0[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/rajtraining/ejb/da/TestLocalStatefulBeanLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/tans/ejb/example/da/UserBeanLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/tans/ejb/example/da/UserBeanLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..94eaced[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/tans/ejb/example/da/UserBeanLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/tans/ejb/example/da/UserBeanLocalLocal.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/tans/ejb/example/da/UserBeanLocalLocal.class[m
[1mnew file mode 100644[m
[1mindex 0000000..5d3153d[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/tans/ejb/example/da/UserBeanLocalLocal.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/trans/mand/bl/MandRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/trans/mand/bl/MandRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..9fb8026[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/trans/mand/bl/MandRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/trans/mand/bl/MandRemoteRemote.class b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/trans/mand/bl/MandRemoteRemote.class[m
[1mnew file mode 100644[m
[1mindex 0000000..2de5692[m
Binary files /dev/null and b/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/trans/mand/bl/MandRemoteRemote.class differ
[1mdiff --git a/raj-trainingEjb/dist/gfdeploy/raj-trainingEjb/raj-trainingEjb-ejb_jar/com/trans/mand/da/MandLocal.class b/raj-tr