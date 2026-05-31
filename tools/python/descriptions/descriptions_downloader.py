# Stub for the kosher Organic Maps fork.
#
# Upstream's Wikipedia/Wikidata descriptions downloader is intentionally absent from this
# fork. maps_generator imports these symbols at module load time (generator/stages_declaration.py),
# so we provide no-op stubs: map generation works without fetching any Wikipedia content.
# The StageDownloadDescriptions stage is skipped during generation anyway.


def check_and_get_checker(*args, **kwargs):
    return None


def download_from_wikipedia_tags(*args, **kwargs):
    return None


def download_from_wikidata_tags(*args, **kwargs):
    return None
