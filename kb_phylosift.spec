/*
A KBase module: kb_phylosift
*/

module kb_phylosift {
    /*
        Insert your typespec information here.
    */

    typedef structure {
        string workspace_name;
        string input_reads_ref;  /* readsLibrary or readsSet */
        string output_tax_profile_name;  /* output tax profile object */
    } RunPhylosiftParams;
    
    typedef structure {
        string report_name;
        string report_ref;
    } RunPhylosiftOutput;
    
    funcdef run_phylosift (RunPhylosiftParams params) returns (RunPhylosiftOutput output) authentication required;
    
};
