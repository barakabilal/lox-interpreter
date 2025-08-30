Crafting Interpreters: Lox
Description

This project is an implementation of Lox, a simple scripting language, following the book Crafting Interpreters by Bob Nystrom.
It includes a scanner, parser, and interpreter for the Lox language.

Features

Lexical analysis (scanner / tokenizer)

Parsing into an Abstract Syntax Tree (AST)

Interpreting and executing Lox code

Supports variables, expressions, control flow, functions, and more

Installation

Clone the repository:

git clone https://github.com/your-username/lox.git


Navigate to the project folder:

cd lox


Compile the Java code:

javac -d out src/com/craftinginterpreters/lox/*.java

Usage

Run a Lox script:

java -cp out com.craftinginterpreters.lox.Lox your_script.lox


Or enter interactive mode (REPL):

java -cp out com.craftinginterpreters.lox.Lox

Example
var language = "lox";
print language + " is awesome!";


Output:

lox is awesome!

References

[Crafting Interpreters by Bob Nystrom](https://craftinginterpreters.com/)


Author: Bob Nystro