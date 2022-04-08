# JavaUnitTestingFramework
A simple collection of classes which allow testing of functions and methods through a simple console based approach

The framework allows for a very barebones approach, with only two classes which need to be imported.
The idea is to create a seperate console executable purely for tests, which runs independently to the rest of the application.
The user is required to create a 'Test' class, which contains methods which 'Test' their respective methods.
For example if we had a Math class and wanted to test the Addition method we can create another class called TestMath which contains a method called TestAddition
the method has exactly the same parameters as the Math class. The idea here is to manually create the algorithm with the given parameters and set its value to a
variable called expected, and then a variable called actual, which calls the function being tested.
We create a TestModel within the test method, passing through the 'name' of the test. We do this so we can recognise the test if something goes wrong.
We then call one of the given methods we want to use to test the given method, in this case we will use the Equals method, as we want to test if the value we should get
is equal the value we actually get (Note here we pass through the expected and actual objects), and then finally return the TestModel object.
In the console class, we need to create an instance of the ExecuteTests class. The idea here is that we can group toghether different tests, so we can run groups of 
different tests independantly. We then use the AddTest method to pass through a given TestModel. Finally we can call the Run method, which finds the result of all the 
TestModels showing any errors.

