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

        for (int i = 0; i < right.size(); i++) {
            cout << right[i] << " ";
        }
        cout << endl;

        for (int i = 0; i < left.size(); i++) {
            cout << left[i] << " ";
        }
        cout << endl;

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

int main()
{
    vector<float> chances;

    //заполнение массива вероятностей
    float in;
    float index = 1;
    do {
        cout << "Enter a" << index << ": ";
        cin >> in;

        if (in != 0) {
            chances.push_back(in);
            index++;
        }
    } while (in != 0);

    //сортировка массива вероятностей
    for (int i = 0; i < chances.size(); i++) {
        for (int j = i; j < chances.size(); j++) {
            if (chances[i] < chances[j]) {
                float tmp = chances[i];
                chances[i] = chances[j];
                chances[j] = tmp;
            }
        }
    }

    float l = shennonfano(chances, -1);
    float h = entropy(chances);
    float r = l - h;

    cout << "l = " << l << endl;
    cout << "H(a) = " << h << endl;
    cout << "R(a) = " << r << endl;
}