def call(body) {

    // evaluate the body block, and collect configuration into the object

    def params= [:]

    body.resolveStrategy = Closure.DELEGATE_FIRST

    body.delegate = params

    body()

 

    echo params.someParam

}

 
   
