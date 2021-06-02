#include <iostream>
#include <string>

class base_op;
class int_op;
class str_op;

// visitable
class base_op {
public:
    virtual void print_value() = 0;
    virtual base_op* operator+(base_op& what) = 0;
    virtual base_op* operator+(str_op& what) = 0;
    virtual base_op* operator+(int_op& what) = 0;
};

class str_op : public base_op {
public:
    std::string val;

    str_op(const std::string& val_) : val(val_) {}

    void print_value() { std::cout << "value of string operand: " << val << std::endl; }
    
    base_op* operator+(base_op& what) override;
    base_op* operator+(str_op& what) override;
    base_op* operator+(int_op& what) override;

};

class int_op : public base_op {
public:
    int val;

    int_op(int val_) : val(val_) {}

    void print_value() { std::cout << "value of int operand: " << val << std::endl; }

    base_op* operator+(base_op& what) override;
    base_op* operator+(str_op& what) override;
    base_op* operator+(int_op& what) override;
};

// --- str_op -----------

base_op* str_op::operator+(base_op& what) {
    return what + *this;
}

base_op* str_op::operator+(str_op& what) {
    return new str_op(val + what.val);
}

base_op* str_op::operator+(int_op& what) {
    return new str_op(val + std::to_string(what.val));
}

// --- int_op -----------

base_op* int_op::operator+(base_op& what) {
    return what + *this;
}

base_op* int_op::operator+(str_op& what) {
    return new str_op(std::to_string(val) + what.val);
}

base_op* int_op::operator+(int_op& what) {
    return new int_op(val + what.val);
}