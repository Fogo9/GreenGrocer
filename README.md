# **GREENGROCER**

# Information

* **You can find out the total amount by entering the kilograms of the products.**

# Technologies Used

* **JAVA**

# Contents

* The kilogram prices of the products were determined.

* Scanner class is used to retrieve data from user.

* The entered values ​​are multiplied by the kilogram price of the products and the result is obtained.

* The total amount is printed in TL.

<br />

```Java

public class Greengrocer{

        public static void main(String[] args) {

        double Pear = 2.14, Apple = 3.67, Tomato = 1.11, Banana = 0.95, Aubergine = 5.00;

```

```Java

        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms is a Pear? :");

        Pear = input.nextDouble();

        System.out.print("How many kilograms is a Apple? :");

        Apple = input.nextDouble();

        System.out.print("How many kilograms is a Tomato? :");

        Tomato = input.nextDouble();

        System.out.print("How many kilograms is a Banana? :");

        Banana = input.nextDouble();

        System.out.print("How many kilograms is a Aubergine? :");

        Aubergine = input.nextDouble();

```
```Java

        double amount = (Pear * 2.14) + (Apple * 3.67) + (Tomato * 1.11) + (Banana * 0.95) + (Aubergine * 5.00);

        System.out.println("Total Amount : " + amount + " TL ");

```

```bash

        How many kilograms is a Pear? :0
        How many kilograms is a Apple? :1
        How many kilograms is a Tomato? :1
        How many kilograms is a Banana? :2
        How many kilograms is a Aubergine? :3
        Total Amount : 21.68 TL

```
<br />

# LINK

* Click here https://github.com/Fogo9/GreenGrocer.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
