// #include <iostream>
// #include <string>
#include "bin_op_example.hpp"



int main(int argc, const char* argv[])
{
    concrete_operand1 co1{"hello"};
    concrete_operand2 co2{42};

    operand_base& ob1 = co1;
    operand_base& ob2 = co2;
    
    auto&& result = ob1 + ob2;
    auto&& result2 = ob2 + ob1;
    // result.foo();

    std::cout << result << std::endl;
    std::cout << result2 << std::endl;


    return 0;
}



