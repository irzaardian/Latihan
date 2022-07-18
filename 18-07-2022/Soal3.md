### Deskripsi
Buatlah program permainan Batu, Gunting, Kertas.
Program ini dapat dimainkan dengan 2 jenis mode `Player 1 vs Player 2` dan `Player 1 vs Computer`.

Jika mode yang dipilih adalah `Player 1 vs Player 2`, maka pengguna akan memasukkan langkah secara bergantian.

Jika mode yang dipilih adalah `Player 1 vs Computer`, maka pengguna akan memasukkan satu langkah dan dilanjutkan oleh komputer yang memilih langkah secara random.

Dengan menerapkan aturan umum Batu, Gunting, Kertas maka program akan menantukan siapa pemenang dari permainan yang berjalan.

Buatlah antarmuka sederhana agar cara kerja program mudah dipahami.

```
Selamat datang di game Batu, Gunting, Kertas!
Silahkan pilih mode permainan:
1. Player 1 vs Player 2
2. Player 1 vs Computer

Langkah yang bisa dipilih:
B: Batu
G: Gunting
K: Kertas
```


### Contoh 1
Input
```
1
Player 1: B
Player 2: G
```
```
Player 1 menang!
```
Penjelasan: `1` adalah input untuk mode permainan. Setelah pengguna menginput `1`, maka secara bergantian pengguna harus memasukkan langkah untuk Player 1 dan Player 2.


### Contoh 2
Input
```
2
Player 1: B
Computer: K
```
```
Computer menang!
```
Penjelasan: `2` adalah input untuk mode permainan. Setelah pengguna menginput `2`, maka secara pengguna hanya perlu memasukkan langkah untuk Player 1.