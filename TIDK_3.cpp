#include <iostream>

using namespace std;

int main()
{
    int sizeChancesArray;
    int sizeChannelMatrix;

    double OUE = 0;     //общая условная вероятность
    double EPS = 0;     //энтропия принятых сообщений
    double EO = 0;      //энтропия объединения

    int numberSymbols;  //количество передаваемых символов
    double deltaI;      //информационные потери
    double I;           //количество принятой информации

    cout << "Enter the size of chances array: ";
    cin >> sizeChancesArray;
    cout << "Enter the size of channel matrix: ";
    cin >> sizeChannelMatrix;
    cout << "Enter the number of symbols in message: ";
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

    cout << "---- Enter elements of chances array ----" << endl;
    for (int i = 0; i < sizeChancesArray; i++) {
        cout << "p(s" << i + 1 << "): ";
        cin >> chancesArray[i];
    }

    cout << "---- Enter elements of channel matrix ----" << endl;
    for (int i = 0; i < sizeChannelMatrix; i++) {
        cout << "A(" << i + 1 << "): ";
        for (int j = 0; j < sizeChannelMatrix; j++) {
            cin >> channelMatrix[i][j];
        }
    }

    //вычисление общей условной энтропии
    for (int j = 0; j < sizeChannelMatrix; j++) {
        for (int i = 0; i < sizeChannelMatrix; i++) {
            double logIJ = 0;
            if (channelMatrix[i][j] != 0) {
                logIJ = log(channelMatrix[i][j]) / log(2);
            }
            OUE -= chancesArray[i] * channelMatrix[i][j] * logIJ;
        }
    }

    cout << "OUE = " << OUE << endl;

    //вычисление энтропии принятых сообщений
    for (int j = 0; j < sizeChannelMatrix; j++) {
        double p = 0;
        for (int i = 0; i < sizeChannelMatrix; i++) {
            p += chancesArray[i] * channelMatrix[i][j];
        }
        
        double logP = 0;
        if (p != 0) {
            logP = log(p) / log(2);
        }

        EPS -= p * logP;
    }

    cout << "EPS = " << EPS << endl;

    //вычисление матрицы совместных вероятностей
    for (int i = 0; i < sizeChannelMatrix; i++) {
        for (int j = 0; j < sizeChannelMatrix; j++) {
            jointChancesMatrix[i][j] = channelMatrix[i][j] * chancesArray[i];
        }
    }

    //вычисление энтропии объединения
    for (int i = 0; i < sizeChannelMatrix; i++) {
        for (int j = 0; j < sizeChannelMatrix; j++) {
            double logIJ = 0;
            if (jointChancesMatrix[i][j] != 0) {
                logIJ = log(jointChancesMatrix[i][j]) / log(2);
            }

            EO -= jointChancesMatrix[i][j] * logIJ;
        }
    }

    cout << "EO = " << EO << endl;

    deltaI = numberSymbols * (EO - EPS);
    I = numberSymbols * EPS - deltaI;

    cout << "deltaI = " << deltaI << endl;
    cout << "I = " << I << endl;
}
