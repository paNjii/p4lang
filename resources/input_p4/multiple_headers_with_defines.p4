#define GENV_OPTION_A_TYPE 0x000001
/* TODO: Would it be convenient to have some kind of sizeof macro ? */
#define GENV_OPTION_A_LENGTH 2 /* in bytes */

header_type genv_opt_A_t {
    fields {
        optClass : 16;
        optType : 8;
        reserved : 3;
        optLen : 5;
        data : 32;
    }
}

#define GENV_OPTION_B_TYPE 0x000002
#define GENV_OPTION_B_LENGTH 3 /* in bytes */

header_type genv_opt_B_t {
    fields {
        optClass : 16;
        optType : 8;
        reserved : 3;
        optLen : 5;
        data : 64;
    }
}
