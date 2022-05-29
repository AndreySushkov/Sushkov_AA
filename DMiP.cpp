#include <iostream>

using namespace std;

int* createArray(int n) {
    int* x = new int[n];

    for (int i = 0; i < n; i++) {
        cin >> x[i];
    }

    return x;
}

int** createMat(int n, int* arr) {
    int** r = new int* [n];

    for (int i = 0; i < n; i++)
        r[i] = new int[n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (abs(arr[i] - arr[j]) <= 6)
                r[i][j] = 1;
            else
                r[i][j] = 0;
        }
    }

    return r;
}

int main()
{
    setlocale(LC_ALL, "Russian");

    bool isSP = true;   //проверка на слабо полную матрицу
    int n;              //размерность массива

    cin >> n;

    int* X = createArray(n);
    int** R = createMat(n, X);

    //вывод матрицы
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << R[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl;

    //верхние срезы
    for (int j = 0; j < n; j++) {
        cout << "{ ";
        for (int i = 0; i < n; i++) {
            if (R[j][i] == 1 && X[i] % 3 != 0 && X[j] % 3 != 0) {
                cout << X[i] << " ";
            }
        }
        cout << " }" << endl;
    }
    cout << endl;

    //проверка на слабо полную матрицу
    for (int i = 0; i < n; i++) {
        if (R[i][i] == 1) {
            isSP = false;
        }
    }
    if (isSP)
        cout << "Матрица бинарного отношения - слабо полная" << endl;
    else
        cout << "Матрица бинарного отношения - не слабо полная" << endl;
}
