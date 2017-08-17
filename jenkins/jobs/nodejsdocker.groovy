job('3-Created by Job - NodeJjs-Build-Test') {
    scm {
        git('https://github.com/OscarDHdz/jenkins-node-docker.git', 'master') {

        }
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
        shell("npm test")
        shell("docker build -t dockerapi .")
    }
}
