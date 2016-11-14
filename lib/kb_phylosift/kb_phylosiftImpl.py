# -*- coding: utf-8 -*-
#BEGIN_HEADER
#END_HEADER


class kb_phylosift:
    '''
    Module Name:
    kb_phylosift

    Module Description:
    A KBase module: kb_phylosift
    '''

    ######## WARNING FOR GEVENT USERS #######
    # Since asynchronous IO can lead to methods - even the same method -
    # interrupting each other, you must be *very* careful when using global
    # state. A method could easily clobber the state set by another while
    # the latter method is running.
    #########################################
    VERSION = "0.0.1"
    GIT_URL = ""
    GIT_COMMIT_HASH = ""
    
    #BEGIN_CLASS_HEADER
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR
        #END_CONSTRUCTOR
        pass
    

    def run_phylosift(self, ctx, params):
        """
        :param params: instance of type "RunPhylosiftParams" (Insert your
           typespec information here.) -> structure: parameter
           "workspace_name" of String, parameter "input_reads_ref" of String,
           parameter "output_tax_profile_name" of String
        :returns: instance of type "RunPhylosiftOutput" -> structure:
           parameter "report_name" of String, parameter "report_ref" of String
        """
        # ctx is the context object
        # return variables are: output
        #BEGIN run_phylosift
        #END run_phylosift

        # At some point might do deeper type checking...
        if not isinstance(output, dict):
            raise ValueError('Method run_phylosift return value ' +
                             'output is not type dict as required.')
        # return the results
        return [output]

    def status(self, ctx):
        #BEGIN_STATUS
        returnVal = {'state': "OK", 'message': "", 'version': self.VERSION, 
                     'git_url': self.GIT_URL, 'git_commit_hash': self.GIT_COMMIT_HASH}
        #END_STATUS
        return [returnVal]
