#include <iostream>
#include <vector>

using namespace std;

float shennonfano(vector<float> arr, int numOfSymb) {
    vector<float> left;
    vector<float> right;

    float sumLeft = 0;
    float sumRight = 0;

    if (arr.size() > 1) {
        left.push_back(arr[0]);
        sumLeft += arr[0];

        arr.erase(arr.begin());

        while (!arr.empty()) {
            if (sumLeft >= sumRight) {
                right.insert(right.begin(), arr.back());
                sumRight += arr.back();

                arr.erase(arr.end() - 1);       //непонятный -1
            }
            else {
                left.push_back(arr.front());
                sumLeft += arr.front();

                arr.erase(arr.begin());
            }
        }

        numOfSymb++;
        float leftArr = shennonfano(left, numOfSymb);
        float rightArr = shennonfano(right, numOfSymb);

        float l = leftArr + rightArr;
        return l;
    }
    else {
        numOfSymb++;
        float a = arr[0] * numOfSymb;
        return a;
    }
}

float entropy(vector<float> arr) {
    float h = 0;
    for (int i = 0; i < arr.size(); i++) {
        h -= arr[i] * (log(arr[i]) / log(2));
    }
    return h;
}

void sortArray(vector<float> arr) {
    for (int i = 0; i < arr.size(); i++) {
        for (int j = 0; j < arr.size(); j++) {
            if (arr[i] < arr[j]) {
                float tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
}

int main()
{
    float l, h, r;

    vector<float> symbChances;

    cout << "Enter zero if you want to finish typing" << endl;

    //заполнение массива вероятностей отдельный символов
    float in;
    float index = 1;
    do {
        cout << "Enter a" << index << ": ";
        cin >> in;

        if (in != 0) {
            symbChances.push_back(in);
            index++;
        }
    } while (in != 0);

    sortArray(symbChances);

    l = shennonfano(symbChances, -1);
    h = entropy(symbChances);
    r = l - h;

    cout << "For symbols" << endl;
    cout << "l = " << l << endl;
    cout << "H(a) = " << h << endl;
    cout << "R(a) = " << r << endl;
    
    //создание нового массива вероятностей комбинаций
    vector<float> combChances;
    for (int i = 0; i < symbChances.size(); i++) {
        for (int j = 0; j < symbChances.size(); j++) {
            combChances.push_back(symbChances[i] * symbChances[j]);
        }
    }

    sortArray(symbChances);

    l = shennonfano(combChances, -1);
    h = entropy(combChances);
    r = l - h;

    cout << "For combination" << endl;
    cout << "l = " << l << endl;
    cout << "H(a) = " << h << endl;
    cout << "R(a) = " << r << endl;
}