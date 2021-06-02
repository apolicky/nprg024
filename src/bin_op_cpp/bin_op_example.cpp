// #include <iostream>
// #include <string>
#include "bin_op_example.hpp"



int main(int argc, const char* argv[])
{
    str_op so{"hello"};
    int_op io{42};
    int_op io2{69};

    base_op& ob1 = so;
    base_op& ob2 = io;
    base_op& ob3 = io2;
    
    auto str_int_mixed = ob1 + ob2;
    auto str_str = ob1 + ob1;
    auto int_int = ob2 + ob3;

    str_int_mixed->print_value();
    str_str->print_value();
    int_int->print_value();

    return 0;
}



