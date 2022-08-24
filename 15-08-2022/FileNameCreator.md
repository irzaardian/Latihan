### Description
You are tasked to create a program in user's computer, that checks and saves filenames input by user.

Each filename input is validated before being stored in the program.

If filename input has been stored previously, the program will automatically add an index (`k`) after the filename, where, `k` is the **smallest positive integer** such that the obtained name remains unique.

Program will return validated filename every time user gives a new input.

------

### Example 1
Input
```
pes
fifa
gta
pes (2019)
```
Output
```
pes
fifa
gta
pes(2019)
```
Explanation: Each output is immediately returned by the program every time user inputs a filename.
Let's see how the file system creates folder names:
- "pes" --> has not been stored before, remains "pes"
- "fifa" --> has not been stored before, remains "fifa"
- "gta" --> has not been stored before, remains "gta"
- "pes(2019)" --> has not been stored before, remains "pes(2019)"

------

### Example 2
Input
```
gta
gta (1)
gta
avalon
```
Output
```
gta
gta (1)
gta (2)
avalon
```
Explanation:
- "gta" --> has not been stored before, remains "gta"
- "gta(1)" --> has not been stored before, remains "gta(1)"
- "gta" --> the name is reserved, system adds (`k`), since "gta(1)" is also reserved, systems put `k = 2`. it becomes "gta(2)"
- "avalon" --> has not been stored before, remains "avalon"


------

### Example 3
Input
```
onepiece
onepiece (1)
onepiece (2)
onepiece (3)
onepiece
```
Output
```
onepiece
onepiece (1)
onepiece (2)
onepiece (3)
onepiece (4)
```
Explanation: When the last filename is created, the smallest positive valid k is `4`, and it becomes "onepiece(4)".