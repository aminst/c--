# C--
Compiler implementaton for a language called c--.
## Capabilities
### Structs
```c++
struct Student begin
 int grade
 bool pass
end
```
### Comments
```c++
main() begin
 /* Welcome to Compiler course
 This is just a comment!
 */
 display (1400)
end
```
### Functions
```c++
int sampleFunction (int arg1, int arg2) begin
 /*body*/
end
```
### Variables
```c++
fptr < int, int -> int > fpt1
int a
bool d
list # int b
list # list # int c
```
### Conditionals
```c++
if (a == 2) begin
 /* some statements */
end
else begin
 /* some statements */
end
```
### Loops
```c++
while (a > 0) begin
 /* some statements */
end
do begin
 /* some statements */
end while (a > 0)
```
## Implementation
We did the development in four different phases:
1. Grammer definition
2. Name analysis
3. Type analysis
4. Bytecode translation
