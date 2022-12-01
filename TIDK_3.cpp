#include <iostream>

using namespace std;

double calculateOUE(double** matrix, double* chances, int sizeMatrix, int sizeChances) {
    double OUE = 0;
    for (int j = 0; j < sizeMatrix; j++) {
        for (int i = 0; i < sizeMatrix; i++) {
            double logIJ = 0;
            if (matrix[i][j] != 0) {
                logIJ = log(matrix[i][j]) / log(2);
            }
            OUE -= chances[i] * matrix[i][j] * logIJ;
        }
    }
    return OUE;
}

double calculateEPS(double** matrix, double* chances, int sizeMatrix) {
    double EPS = 0;
    for (int j = 0; j < sizeMatrix; j++) {
        double p = 0;
        for (int i = 0; i < sizeMatrix; i++) {
            p += chances[i] * matrix[i][j];
        }

        double logP = 0;
        if (p != 0) {
            logP = log(p) / log(2);
        }

        EPS -= p * logP;
    }
    return EPS;
}

double calculateEO(double** matrix, int sizeMatrix) {
    double EO = 0;
    for (int i = 0; i < sizeMatrix; i++) {
        for (int j = 0; j < sizeMatrix; j++) {
            double logIJ = 0;
            if (matrix[i][j] != 0) {
                logIJ = log(matrix[i][j]) / log(2);
            }

            EO -= matrix[i][j] * logIJ;
        }
    }
    return EO;
}

int main()
{
    setlocale(LC_ALL, "Russian");

    int sizeChancesArray;
    int sizeChannelMatrix;

    double OUE = 0;     //общая условная вероятность
    double EPS = 0;     //энтропия принятых сообщений
    double EO = 0;      //энтропия объединения

    int numberSymbols;  //количество передаваемых символов
    double deltaI;      //информационные потери
    double I;           //количество принятой информации

    cout << "Введите размер массива вероятностей: ";
    cin >> sizeChancesArray;
    cout << "Введите размерность канальной матрицы: ";
    cin >> sizeChannelMatrix;
    cout << "Введите количество символов в сообщении: ";
    cin >> numberSymbols;

    double* chancesArray = new double[sizeChancesArray];

    double** channelMatrix = new double* [sizeChannelMatrix];
    for (int i = 0; i < sizeChannelMatrix; i++) {
        channelMatrix[i] = new double[sizeChannelMatrix];
    }

    double** jointChancesMatrix = new double*[sizeChannelMatrix];
    for (int i = 0; i < sizeChannelMatrix; i++) {
        jointChancesMatrix[i] = new double[sizeChannelMatrix];
    }

    cout << "---- Ввод элементов массива вероятностей ----" << endl;
    for (int i = 0; i < sizeChancesArray; i++) {
        cout << "p(s" << i + 1 << "): ";
        cin >> chancesArray[i];
    }

    cout << "---- Ввод элементов канальной матрицы (построчно) ----" << endl;
    for (int i = 0; i < sizeChannelMatrix; i++) {
        cout << "A(" << i + 1 << "): ";
        for (int j = 0; j < sizeChannelMatrix; j++) {
            cin >> channelMatrix[i][j];
        }
    }
    
    //вычисление матрицы совместных вероятностей
    for (int i = 0; i < sizeChannelMatrix; i++) {
        for (int j = 0; j < sizeChannelMatrix; j++) {
            jointChancesMatrix[i][j] = channelMatrix[i][j] * chancesArray[i];
        }
    }

    OUE = calculateOUE(channelMatrix, chancesArray, sizeChannelMatrix, sizeChancesArray);
    EPS = calculateEPS(channelMatrix, chancesArray, sizeChannelMatrix);
    EO = calculateEO(jointChancesMatrix, sizeChannelMatrix);

    deltaI = numberSymbols * (EO - EPS);
    I = numberSymbols * EPS - deltaI;

    cout << endl;
    cout << "Общая условная энтропия H(B|A) = " << OUE << endl;
    cout << "Энтропия принятых сообщений H(B) = " << EPS << endl;
    cout << "Энтропия объединения H(A, B) = " << EO << endl;
    cout << "Информационные потери deltaI = " << deltaI << endl;
    cout << "Количество принятой информации I = " << I << endl;
}
