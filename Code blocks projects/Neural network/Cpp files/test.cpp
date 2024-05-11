#include <iostream>
#include <fstream>
#include <tools.h>
#include <vector>
#include <string>

using namespace std;

void load_a_line_into_the_image_array (int line_number)
{
    ifstream reader;
    reader.open("Data/mnist_train.csv");
    miscellaneous m;
    std::string line;
    int image [28][28];
    int temp_array [784];
    for (int i = 0 ; i < line_number ; ++i)
        getline(reader,line);
    vector<string> split_string;
    split_string = m.split(line);
    for (int i = 0 ; i < 785 ; ++i)
        temp_array[i] = stoi(split_string[i]);
}
