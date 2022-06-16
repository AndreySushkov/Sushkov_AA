#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    ifstream fout("out.txt");
    int num;

    //создание массива A
    int* A = new int[10];

    //заполнение массива A
    for (int i = 0; i < 10; i++) {
        fout >> A[i];
    }

    //вывод массива A
    for (int i = 0; i < 10; i++) {
        cout << A[i] << " ";
    }
    cout << endl;

    cin >> num;

    //вычисление размера массива B
    int counter = 0;
    for (int i = 0; i < 10; i++) {
        if (A[i] == num) {
            counter++;
        }
    }

    //создание массива B
    int* B = new int[counter];

    int n = 0;
    //заполнение массива B
    for (int i = 0; i < 10; i++) {
        if (A[i] == num) {
            B[n] = i;
            n++;
        }
    }

    for (int i = 0; i < counter; i++) {
        cout << B[i] << " ";
    }
    cout << endl;

    fout.close();
}
