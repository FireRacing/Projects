#include <iostream>
#include <math.h>
#include <fstream>
#include <vector>

using namespace std;

class mathematical_tools{
public:
    float sigmoid (int x)
    {
        return 1/(1 + exp(-x));
    }
    float sigmoid (float x)
    {
        return 1/(1 + exp(-x));
    }
};

class miscellaneous{
public:
    vector<string> split(string s, char delimiter)
    {
        string temp_string;
        for (int i = 0; s[i] != '\0'; i++)
        {
            if (s[i] == ',')
            {
                string_vector.push_back(temp_string);
                temp_string = " ";
            }
            else
                temp_string = temp_string + s[i];
        }
        return string_vector;
    }
};

class file_io{
protected:
    FILE *file;
    std::string opencl_kernel;
public:
    string open_file(FILE *file)
    {
        std::ifstream reader;
        reader.open(file);
        string line, line1;
        if (reader.is_open())
        {
            getline (reader,line);// Gets first line
            string line1 = line;
            while (reader.is_open())
            {
                getline (reader,line); // Gets next line
                line1 += line; // Appends next line to first line
            }
        }
        reader.close();
        return line1;
    }
};

int main ()
{

}
