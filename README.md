# Java Reflection API

Reflection API of java is a way to access and modify the state of any object includes constructors, fields, methods during the runtime. 

It can access the metadata of a class and its members, including their types, modifiers, annotations, and generic information. 

## Methods 

* `getDeclaredFields()` - return the list of fields of an object
* `getDeclaredField(name)` - return the particular field of an object 
* `get(object)` - return the value of particular field of an object
* `set(object, value)` - assign the new value to the particular field of an object
* `getDeclaredConstructors()` - return the list of constructors of an object
* `getDeclaredMethods()` - return the list of methods of an object
* `getDeclaredMethod(name)` - return the particular field of an object
* `setAccessible(true)` - used to set the accessibility of a field or method 
* `invoke(object)` - used to call the methods of an object 

## Limitations & risks

The Reflection API is powerful but also has below limitations and risks.

* Reflection API can be slower because it will do operations in runtime.  
* Accessing or invoking private fields may violate encapsulation and security policies. 
* Reflection API may not work correctly in dynamic code generation or bytecode manipulation operations. 