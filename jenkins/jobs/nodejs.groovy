job('NodeJS-Build-Test') {
    scm {
        git('https://github.com/OscarDHdz/jenkins-node-docker.git') {

        }
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
