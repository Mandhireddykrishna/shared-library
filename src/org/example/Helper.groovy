// src/org/example/Helper.groovy
package org.example

class Helper implements Serializable {
    def steps

    Helper(steps) {
        this.steps = steps
    }

    Helper() {} // For simple usage without steps

    def sayHello(String name) {
        println "Helper says Hello to ${name}!"
    }
}
