\# Hello App UC2



This Java program prints a greeting using command-line arguments.



\## Compile

javac Hello\_app\_UC2.java



\## Run

java Hello\_app\_UC2 Alice

\##UC2 Implemented successfully



\##UC1

Displays "Hello, World!" message.



\## UC3



This version handles both cases:

\- With argument → Hello, Alice!

\- Without argument → Hello, World!



\## UC4



This version supports multiple names:

\- java Hello\_app\_UC2 Alice Bob → Hello, Alice, Bob!

\- java Hello\_app\_UC2 → Hello, World!



\## UC5



This version uses StringBuilder to efficiently handle multiple names.



Examples:

java HelloApp Alice Bob → Hello, Alice, Bob!

java HelloApp → Hello, World!



\## UC6



This version uses substring() to remove trailing delimiter.



Examples:

java HelloApp Alice Bob → Hello, Alice, Bob!

java HelloApp → Hello, World!



\## UC7



This version uses String.join() for clean and efficient concatenation.



Examples:

java HelloApp Alice Bob → Hello, Alice, Bob!

java HelloApp → Hello, World!

