#include <iostream>
#include <string>

class operand_base;
class concrete_operand2;
class concrete_operand1;

// visitable
class operand_base {
public:
    virtual void foo() = 0;
    virtual std::string operator+(operand_base& what) = 0;
    virtual std::string operator+(concrete_operand1& what) = 0;
    virtual std::string operator+(concrete_operand2& what) = 0;
};

class concrete_operand1 : public operand_base {
public:
    std::string val;

    concrete_operand1(const std::string& val_) : val(val_) {}

    void foo() {
        std::cout << "foo from co1" << std::endl;
    }
    
    std::string operator+(operand_base& what) override;
    std::string operator+(concrete_operand1& what) override;
    std::string operator+(concrete_operand2& what) override;

};

class concrete_operand2 : public operand_base {
public:
    int val;

    concrete_operand2(int val_) : val(val_) {}

    void foo() {
        std::cout << "foo from co2 " << this << std::endl;
    }

    std::string operator+(operand_base& what) override;

    std::string operator+(concrete_operand1& what) override;

    std::string operator+(concrete_operand2& what) override;
};

std::string concrete_operand1::operator+(operand_base& what) {
    return what + *this;
}

std::string concrete_operand1::operator+(concrete_operand1& what) {
    return val + what.val;
}

std::string concrete_operand1::operator+(concrete_operand2& what) {
    return val + std::to_string(what.val);
}

std::string concrete_operand2::operator+(operand_base& what) {
    return what + *this;
}

std::string concrete_operand2::operator+(concrete_operand1& what) {
    return std::to_string(val) + what.val;
}

std::string concrete_operand2::operator+(concrete_operand2& what) {
    return std::to_string(val + what.val);
}