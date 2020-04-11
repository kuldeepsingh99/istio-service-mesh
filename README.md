# Service Mesh with Istio

## How to create AWS Instance and configure master and slave nodes ##

[Click here to download PPT](https://drive.google.com/open?id=1EwdjRzMtFKiV2JILaI6IChXGuO9eWJWy)

In this example we will learn how to configure AWS Instance, i already have created an AWS image where kubernetes is also installed.
In this we will see how configure master nodes and how slave nodes joins cluster

## Istio Installation Version 1.5 ##

[Click here to download PPT](https://drive.google.com/open?id=15T_EraatqS7ARW9fsB4rQHo-Kqf-sLM6)

In this we will learn how to install istio

## Micro service installation ##

[Click here to download PPT](https://drive.google.com/open?id=1i2KQ4A0OT00gLaLD4G3Z1WpJxVFE98kt)

We have two microserice **Customer** and **practice**. 

Customer microservice calls the practice microservice. 

[Customer](https://hub.docker.com/repository/docker/kuldeep99/customer) and [practice](https://hub.docker.com/repository/docker/kuldeep99/practice) images are pulled from docker hub.

One version of customer (V1) and four version of practice (V1,V2 and V3) microservice are deployed to cluster.

In this example we will see how to configure [customer](https://github.com/kuldeepsingh99/servicemesh/blob/master/istio/customer-service.yaml) and [practice](https://github.com/kuldeepsingh99/servicemesh/blob/master/istio/prac-service.yaml) yaml files. Setting up classic load balancer and access microservice in browser.

We also need to apply to apply [routing rules](https://github.com/kuldeepsingh99/servicemesh/blob/master/istio/default-destination-rule_v1_v2_v3.yaml) and [Customer Gateway & Virtual Service](https://github.com/kuldeepsingh99/servicemesh/blob/master/istio/customer-gatway.yaml)

## Domain setting ##

[Click here to download PPT](https://drive.google.com/open?id=1EXpRpp-AtyJR_Njm2-KiPXLNqUimlM4c)

In this we will see how to set public domain in Route53 and map it with Load balancer and finally accessing the microservice with public domain.

## Monitirong with prometheus & graphana ##

[Click here to download PPT](https://drive.google.com/open?id=1NtMpqe_9JGgCToUyAH4irad03Kx4PTOV)

How to set the Gateway and Virtual service rules to access Graphana in browser

## Visualization with kiali ##

[Click here to download PPT](https://drive.google.com/open?id=1-eltKYF1fYcPQ8aZIqS6TmWcaBGklpDK)

How to set the Gateway and Virtual service rules to access Kiali in browser

## Distributed tracing with Jaeger ##

[Click here to download PPT](https://drive.google.com/open?id=13zItIyzlOsdXJmQg8sJc_MfkRBniwf1u)

How to set the Gateway and Virtual service rules to access jaeger in browser

## Traffic Routing ##

[Click here to download PPT](https://drive.google.com/open?id=1j34yEsDLdiLPBnuSsPSbcXXJanywxCXz)

How to route 100% traffic to Version V1 and how to route Percentage wise traffic to version from command and kiali

## Handling Retry ##

[Click here to download PPT](https://drive.google.com/open?id=1gE34q7_wN91kA3T1PwzN3dGtnSpDrCc0)

Here we have deployed [V4 of Practice Service](https://github.com/kuldeepsingh99/servicemesh/blob/master/istio/practice_buggy_deploy.yaml) which has some Issue and it will randomly throw exception

Here is the Code
```
Random random = new Random(); 
int randomNumber = random.nextInt(10);
		
if(randomNumber < 5) {
  throw new Exception("not able to process");
} else {
  return "practice service V4";
}
```
Here we will see how [istio retry](https://istio.io/docs/concepts/traffic-management/#retries) mechanism will help.

In this example we will redirect all traffic to Practice(V4) version and check the sucess rate in graphana, then we will apply [Practice Service Retry rules yaml](https://github.com/kuldeepsingh99/servicemesh/blob/master/istio/practice_retry.yaml) and check the success rate

## Outlier Detection & Circuit Breaker ##

[Click here to download PPT](https://drive.google.com/open?id=1MiIiLVTuq5iapg0KmCPl_rvaI5YNNwez)

## Mirroring ##

[Click here to download PPT](https://drive.google.com/open?id=1JhMf9LjQkVnTHOAke-__2QI_NAwYqBN_) 

## HTTPS Configuration in NLB ##
[Click here to download PPT](https://drive.google.com/open?id=1QtovvTCtXYm2EEDtYWTM-946fa-BJ0Om)
