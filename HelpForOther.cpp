#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
    ifstream fout("out.txt");
    int counterX = 0,
        counterY = 0;
    char ch = ' ';
    string str;

    //вычисление кол-ва столбцов
    while (ch != '\n') {
        fout.get(ch);
        counterX++;
    }
    counterX /= 2;
    fout.seekg(0);

    //вычисление кол-ва строк
    while (!fout.eof()) {
        getline(fout, str);
        counterY++;
    }
    fout.seekg(0);

    //создание двумерного массива
    int** A = new int*[counterY];
    for (int i = 0; i < counterY; i++) {
        A[i] = new int[counterX];
    }

    //заполнение массива
    for (int i = 0; i < counterY; i++) {
        for (int j = 0; j < counterX; j++) {
            fout >> A[i][j];
        }
    }

    //вывод массива
    for (int i = 0; i < counterY; i++) {
        for (int j = 0; j < counterX; j++) {
            cout << A[i][j] << " ";
        }
        cout << endl;
    }

    int product = 1;
    //основной алгоритм
    for (int i = 0; i < counterY; i++) {
        for (int j = 0; j < counterX; j++) {
            if (A[i][j] % 2 == 0) {
                product *= A[i][j];
            }
        }
    }

    cout << product << endl;

    fout.close();
}

