#### SOLID
##### S - > Single responsiblity principal
##### o - > open closed principle
##### l - > liskov's substitution principle
if class B is subtype of class A , then we should be able to replace object of A 
with B without breaking the behaviour of the programme.
(subclass should extend capablity of parent class not narrow it down)

##### I - > Interface segmented principle
client should not implement unnecessary function that they do 
not need.

##### I - > DependencyInversion Principle
class should depend on interface rather than concrete classes

### Startegy Design Pattern
when child shares the same capability which is not present in the base class.
as the new feature comes we dont have to repeat code. 

### Observer Design Pattern
Question : implement amazon's notify me when stock becomes zero


