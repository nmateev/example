@Library('ci-cd-library') _

    properties([
            parameters([
                    string(name: 'ARCHIVE', defaultValue: 'build/libs/*.jar', description: 'Files to archive, can be a comma separated list'),
                    booleanParam(name: 'CLEAN_WORKSPACE', defaultValue: false, description: 'Toggle to clean the workspace before build'),
                    booleanParam(name: 'SKIP_TESTS', defaultValue: false, description: 'Toggle to skip unit tests during the build')
            ])
    ])

def parameters = [
        name : 'Landlord Communication'
]

buildGradlePipeline(parameters)
