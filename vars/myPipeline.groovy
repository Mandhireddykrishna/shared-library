// vars/myPipeline.groovy
def call(String name = 'World') {
    echo "Hello, ${name}!"
    def helper = new org.example.Helper()
    helper.sayHello(name)
}
