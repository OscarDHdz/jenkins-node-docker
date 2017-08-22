# Jenkins-docker node CI/CD example
Basic express API example used for Jenkins-Docker example with Job, DSL Job and Pipeline

## Getting Started
Install dependencies  
```
npm install
```

Run server:  
```
npm start
```

### Test Available
Run  
```
npm test
```


### Routes
1. GET: **/**


# Contents

Inside /jenkins folder, you can see:
1. jobs - Which containes:
   * nodejs.groovy -> A job that: Git clones this repo > npm installs > npm test
   * nodejsdocker.groovy -> A job that: Gic clones this repo > npm installs > npm test > builds docker image

2. pipelines
   * Jenkinsfile -> A pipeline that has 3 stages:
      * Preparation - Git clones and gets commit_id
      * test - npm installs and test
      * docker build - Creates the docker images with commit_id as version tag

# Getting Jenkins-Docker Environment
If you want to get a Jenkins dev environment to test this out of the box, feel free to check
my other repo: [jenkins-docker-vagrant](https://github.com/OscarDHdz/jenkins-docker-vagrant)
