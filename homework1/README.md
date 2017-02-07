# Homework 1

* Due: 2/20 -- late homework not accepted
* Up to two students may collaborate; please be prepared to discuss individual contributions

## Details

The objective of this homework assignment is to define your own language or DSL and to write a matching lexical analyzer.  It is possible that your DSL may be incomplete at this stage.  This is Ok.  We just need to get started.

* You should pick a domain (area) that is of interest to your team.  Once the domain is defined, you will need to identify key features of the domain.  For example, if you were to pick stock market/financial domain, some key features would include trading rules, conditions, calculating moving average, etc.

* Next you should come up with a simple grammar rule for your language **and** corresponding examples.  For example, you might have something like the following to represent definition of a variable, update the variable, and printing the variable:

```
i = new SYM(ibm);
UPDATE(i);
print(i);
```

Obviously the above example is fairly limited.  Your DSL should be much more complete and comprehensive.  Tip:  you should spend at least 2 to 3 hours thinking about the domain and studying up on it; unless, of course, it's something that you are intimately familiar with.

* Finally, you will write a lexical analyzer.  The goal of this task is to read in various code examples and build tokens.  Your program should also print out othe tokens.

In the above example, the output would be

```
STATEMENT: 
   ID 
   T_ASSIGNMENT
   T_OP
   T_FN
   T_DELIM
STATEMENT:
   T_FN
   T_LPAREN
   ID
   T_RPAREN
   T_DELIM
STATEMENT:
   T_FN
   T_LPAREN
   ID
   T_RPAREN
   T_DELIM
```

Note that the above example is not the only way to represent your symbol table.  It's a way and you are free to represent the symbol table in any other fashion, as long as it's clear and correspond correctly to the language specification.

## Grading Scale/Criteria

* 5 completed correctly + enhancements
* 4 all requirements are met
* 3 all but a few requirements are met
* 2 significant number of requires are missing
* 0 not completed

## Submission

Students will need to demonstrate their homework assignment in class.
