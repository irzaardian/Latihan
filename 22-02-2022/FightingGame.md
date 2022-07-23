### Deskripsi
Buatlah sebuah game fighting sederhana.

Game ini dimainkan oleh 2 player secara bergantian.

Permainan dimulai dengan masing-masing player memiliki `health_bar` sebesar `100` poin.
Pada setiap gilirannya, masing-masing pemain dapat memilih 1 action dari 4 action yang berbeda untuk menyerang pemain lainnya.

Action tersebut memiliki kekuatannya masing-masing untuk mengurangi `health_bar` lawan, atau untuk melindungi diri sendiri.
```
X (Punch) : -10 poin
Y (Kick) : -20 poin
B (Special Move) : -30 poin
A (Defense) : Jika menggunakan action ini, maka action sebelumnya dari lawan tidak akan mengurangi health_bar 
```

Permainan berakhir jika ada salah satu pemain yang kehabisan `health_bar` (`health_bar` < 1).


### Contoh
```
Mulai!
Player 1: X
Player 2: Y
Player 1: B
Player 2: A
Player 1: B
Player 2: B
Player 1: Y
Player 2: Y
Player 1: X
Player 2: B

Player 2 menang!
```