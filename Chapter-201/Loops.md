## LOOPS in JAVA
- In computer programming, a loop is a sequence of instruction s that is continually repeated until a certain condition is reached.
-  In Java we have 3 loops 
        - for loop 
        - while loop
        - do while loop

[![N|Solid](https://static.javatpoint.com/images/java-loops.png)](https://docs.oracle.com/en/java/)

**Real time examples**
- Life itself is a for loop. The variable is TIME.
- Software of the ATM machine is in a loop to process transaction after transaction until you acknowledge that you have no more to do.
- Software program in a mobile device allows user to unlock the mobile with 5 password attempts. After that it resets mobile device.

## FOR LOOP
- The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.
- Types:
   - Simple for Loop
    - For-each or Enhanced for Loop
    - Labeled for Loop

**Syntax**
```java
for(initialization; condition; increment/decrement){    
//statement or code to be executed    
}  


```


**Initialization**:
- It is the initial condition which is executed once when the loop starts. 
- Here, we can initialize the variable, or we can use an already initialized variable. 
- It is an optional condition.

**Condition**: 
- It is the second condition which is executed each time to test the condition of the loop. 
- It continues execution until the condition is false. 
- It must return boolean value either true or false. 
- It is an optional condition.

**Increment/Decremen**t:
- It increments or decrements the variable value. 
- It is an optional condition.

**Statement**: The statement of the loop is executed each time until the second condition is false.


[![N|Solid](https://media.geeksforgeeks.org/wp-content/uploads/loop2.png)](https://docs.oracle.com/en/java/)

```java

//exp-1
for(int i=1;i<=10;i++){  
System.out.println(i);  
 }  
 
//exp:2
String[] mobiles = {"Oppo","OnePlus","realme","Vivo"};

for(int i=0;i<mobiles.length;i++){
System.out.println(mobiles[i]);
}



```

[![N|Solid](https://www.wikitechy.com/tutorials/java/img/java-images/for-loop.gif)](https://docs.oracle.com/en/java/)


### for each loop 
- The for-each loop is used to traverse array or collection in Java. 
- It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
- It works on the basis of elements and not the index. It returns element one by one in the defined variable.


**Syntax**
```
for(data_type variable : array_name){    
//code to be executed    
}    

```
```java


int[] marks = new int[5];
for(int i=0;i<marks.length;i++){
    marks[i] = i+80;
}

for(int d: marks){
    System.out.println(d);
}
```

### Infinitive for Loop
- If you use two semicolons ;; in the for loop, it will be infinitive for loop.
- In Software development always avoid running infinite loops because
    - It will consume more cpu time and memory 
    - Halt the system performance.
```java
    for(;;){  
        System.out.println("infinitive loop");  
    } 
```

## WHILE LOOP
-  A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
-  The while loop can be thought of as a repeating if statement. 

```java

Syntax :

while (boolean condition)
{
   loop statements...
    update_expression;
}
```

[![N|Solid](https://media.geeksforgeeks.org/wp-content/uploads/Loop1.png)](https://docs.oracle.com/en/java/)

[![N|Solid](https://www.codesdope.com/pa-images-bucket/courses/java/l2.gif)](https://docs.oracle.com/en/java/)

##### How Does a While loop execute? 
1. Control falls into the while loop.
2. The flow jumps to Condition
3. Condition is tested. 
    - If Condition yields true, the flow goes into the Body.
    - If Condition yields false, the flow goes outside the loop
4. The statements inside the body of the loop get executed.
5. Updation takes place.
6. Control flows back to Step 2.
7. The while loop has ended and the flow has gone outside.
    


```java

// initialization expression
    int i = 1;
// test expression
while (i < 6) {
    System.out.println("Hello World");

    // update expression
    i++;
}

//ex-2

int x = 1, sum = 0;

// Exit when x becomes greater than 4
while (x <= 10) {
    // summing up x
    sum = sum + x;
    x++;
}
System.out.println("Sum of N numbers: " + sum);
        
```

#### infinite while loop
```java

 while (x == 5)
{
    System.out.println("In the loop");
}

int i =0;

List<Integer> scores = Arrays.asList(99,98,94,65);
while (i< scores.size()){
    System.out.println(scores.get(i));
}
        
```

## DO WHILE LOOP.
> do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop. 
- Java do-while loop is an Exit control loop. Therefore, unlike for or while loop, a do-while check for the condition after executing the statements of the loop body.

- real time examples: menu to the users.  

```

do{ 
snoozeWakeupAlarm(); 
}while(reallyNotThatLoud(voiceOfMom)); 


Do
    sweep the floor
while (there is dust)
```
**syntax**

```java
do
{
    // Loop Body
    Update_expression
}

// Condition check
while (test_expression);

//The test_expression for the do-while loop must return a boolean value , else we would get compile-time error.
```

- The do block is executed at least once, even if the condition is false.

[![N|Solid](https://media.geeksforgeeks.org/wp-content/uploads/loop3.png)](https://docs.oracle.com/en/java/)


```java

// initial counter variable
int i = 0;

do {

    // Body of loop that will execute minimum  1 time for sure no matter what
    System.out.println("Print statement");
    i++;
}

// Checking condition Note: It is being checked after  minimum 1 iteration
while (i < 0);
}
    
  ```

##### infinite do while loop
- If you pass true in the do-while loop, it will be infinitive do-while loop.
```java

do{  
//code to be executed  
}while(true);  


```


## Looping Statements 
- In Java we have .
    break 
    continue 

#### Break 
- When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.

- The Java break statement is used to break loop or switch statement. 
- It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.

- We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.
- 
```java

for (int i = 0; i < 100; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}

```

#### Try these?

```java

for(int i=0;i<100;i++){
    System.out.println("inside for loop..");
    break;
}

for(int i=0;i<100;i++){
    break;
    System.out.println("inside for loop..");
}

```

#### continue
- The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
```java

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}

```

### Try these?
```java

for(int i=0;i<100;i++){
    System.out.println("inside for loop..");
    continue;
    System.out.println(i);
}


for(int i=0;i<100;i++){
   continue;
    System.out.println("inside for loop..");
}

```


## NESTED LOOPS
- A nested loop has one loop inside of another. 
- Needed for transvering 2D arrays/Lists/Matrices.
- Accessing / Updating 2D data.
- For one ITERATION of OUTER LOOP , INNER LOOP has to execute all it's ITERATIONS/BODY.
- 

#### NESTED FOR LOOP
```java

for ( initialization; condition; increment ) {

   for ( initialization; condition; increment ) {
      
      // statement of inside loop
   }

   // statement of outer loop
}

```

#### NESTED WHILE
```java

while(condition) {

   while(condition) {
      
      // statement of inside loop
   }

   // statement of outer loop
}

```

#### NESTED DO WHILE

```java

do{

   do{
      
      // statement of inside loop
   }while(condition);

   // statement of outer loop
}while(condition);

```

`NOTE`:
    There is no rule that a loop must be nested inside its own type. In fact, there can be any type of loop nested inside any type and to any level.
    
#### EXAMPLES
```java

    int i=1;
    int j;
    do{
        j=1;
        do{
            System.out.printf("%d * %d = %d\n",i,j,(i*j));
            j++;
        }while(j<=10);
        i++;
        System.out.println();
    }while(i<=5);

```

## LABELED LOOP
- A label is a valid variable name that denotes the name of the loop to where the control of execution should jump. 
- To label a loop, place the label before the loop with a colon at the end.
- It is a good practise to label a loop when using a nested loop.
- We can also use labels with continue and break statements.

`Syntax:`
```java
    labelname:    
    for(initialization; condition; incr/decr)  
    {    
    //loop body  
    }   
    
    
    
     int i, j;
    //outer loop
    outer:     //label
    for(i=1;i<=5;i++)
    {
        System.out.println();
        //inner loop
        inner:      //label
        for(j=1;j<=10;j++)
        {
            if(i==3)
                break outer;
            System.out.print(j + " ");
    
        }
    }
```

```java

        int i = 0;
        whilelabel:
        while (i < 5)
        {
            System.out.println("outer value of i= " + i);
            i++;
            forlabel:
            for (int j = 0; j < 5; j++)
            {
                if (j > 0)
                {
                    //execution transfer to the for loop      
                    continue forlabel;
                }  
                if (i > 1)
                {
                    //execution transfer to the while loop      
                    continue whilelabel;
                }    
                System.out.println("inner value of i= " + i + ", j= " + j);
            }  //end of for  
        } 

```

### OBSERVATIONS
- Conditions in for ,while , do while loops should be always boolean either true or false
- for(;;) will raise infinite loop.
- Not Incrementing/Decrementing of index variables will raise while infinite loop.
- Choose FOR LOOP , when no of iterations are known in advance
- Choose WHILE LOOP , when we don't know no of iterations.
- {} curly brackets for block of scope is not mandatory when we have only one statement/instruction inside body of for/while/dowhile loops.
- In Nested LOOPS , for one each iteration of OUTER LOOP , the INNER LOOP has to complete all it's iterations.
- LOOPS will fall into following  time complexities
                - Big-Oh(n)
                - Big-Oh(n^2)
                - Big-Oh(n*logN)
                - Big-Oh(n^3)
            

## License

MIT

**Anil K Rajamoni!**
